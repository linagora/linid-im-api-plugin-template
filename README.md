# 📦 Template Directory Manager API Plugin

This repository provides the standard structure and configuration for developing Directory Manager API plugins.

---

## 🚀 Getting Started

To create a new plugin from this template:

1. **Create a new project** on GitLab.
2. Clone your newly created repository:
```bash
git clone https://ci.linagora.com/linagora/lrs/LinID/linid-dm-v2/your-plugin-name.git
cd your-plugin-name
```

3. **Add this template as upstream**:

 ```bash
 git remote add upstream https://ci.linagora.com/linagora/lrs/LinID/linid-dm-v2/template-dm-api-plugin.git
 git fetch upstream
 ```
4. **Remove the CI configuration from the template**:

   > The `.gitlab-ci.yml` in this template is not intended to be reused directly.

 ```bash
 rm .gitlab-ci.yml
 git commit -am "chore: remove template CI file"
 git push origin main
 ```

---

## ♻️ Updating from the Template

When a new version of the template is available, you can synchronize your plugin with the latest changes:

1. Create a dedicated update branch:

 ```bash
 git checkout -b feature/update_from_template
 ```
2. Fetch and merge changes from the template:

 ```bash
 git fetch upstream
 git merge upstream/main
 ```
3. Resolve any conflicts if needed.
4. Push your branch and open a merge request:

 ```bash
 git push -u origin feature/update_from_template
 ```

---

## 🧩 Project Structure

This template provides:

* Standard Maven project structure
* Common CI/CD configuration
* Shared plugin configuration and conventions

---

## 🛠 How to Build / Commit

To build the project:

```bash
mvn clean install
```

This command compiles the code, runs tests, and verifies everything is working as expected.

If you're using the provided CI setup, your commits will also be checked for formatting and message style.
Use the script `scripts/verify_commit_message.sh` if you want to validate your commit messages manually before pushing.

---

## 🧪 Testing

Unit tests use **JUnit 5** and **Mockito**.
To run tests:

```bash
./mvnw test
```

Modify or delete `MyPlugin****PluginTest.java` as needed.

---

## 🛠 Dependencies

This template uses:

* Java 21
* Spring Boot 3.x (provided scope)
* JUnit 5
* Mockito

Dependency versions are managed via the Spring Boot BOM (`spring-boot-dependencies`).

---

## 📁 Project Structure

```
.
├── src/main/java/org/linagora/linid/myplugin/...
│   ├── MyPluginAuthorizationPlugin.java        ← Example AuthorizationPlugin class
│   ├── MyPluginProviderPlugin.java             ← Example ProviderPlugin class
│   ├── MyPluginRoutePlugin.java                ← Example RoutePlugin class
│   ├── MyPluginTaskPlugin.java                 ← Example TaskPlugin class
│   └── MyPluginValisationPlugin.java           ← Example ValidationPlugin class
├── src/test/java/org/linagora/linid/myplugin/...
│   ├── MyPluginAuthorizationPluginTest.java    ← Example AuthorizationPlugin test class
│   ├── MyPluginRoutePluginTest.java            ← Example RoutePlugin test class
│   ├── MyPluginTaskPluginTest.java             ← Example TaskPlugin test class
│   └── MyPluginValisationPluginTest.java       ← Example ValidationPlugin test class
├── template-ci.yml                             ← Template CI configuration (optional)
├── pom.xml
└── README.md
```

---

## ❌ What can be safely removed?

You can safely delete:

* The example plugin and test class (`MyPlugin****Plugin.java`, `MyPlugin****PluginTest.java`)
* The template CI (`template-ci.yml` and `scripts/verify_commit_message.sh`)
  if you plan to use your own CI pipeline

---

## ✅ Tips

* Update `groupId`, `artifactId`, and `version` in `pom.xml` with your own values.
* Use `upstream` remote to keep the template up to date in your own fork.

---

## 📄 License

This template is released under the **LGPL-3.0** license by default.
You can change the license according to your project or client requirements.

---

## 🔄 Version Compatibility

This plugin template follows the versioning of the [`dm-api-core`](https://ci.linagora.com/linagora/lrs/LinID/linid-dm-v2/dm-api-core) project.

Each release of the template is intended to be compatible with the corresponding version of `dm-api-core`.  
When `dm-api-core` publishes a new version, this template may be updated accordingly to integrate any necessary changes or improvements.

If you are using this template in your plugin project, make sure to:
- Monitor `dm-api-core` releases
- Regularly merge updates from this template (see [♻️ Updating from the Template]())
