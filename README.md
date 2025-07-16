# 📦 Template Identity Manager API Plugin

This repository provides the standard structure and configuration for developing Identity Manager API plugins.

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
├── src/main/java/org/linagora/linid/im/myplugin/...
│   ├── MyPluginAuthorizationPlugin.java        ← Example AuthorizationPlugin class
│   ├── MyPluginProviderPlugin.java             ← Example ProviderPlugin class
│   ├── MyPluginRoutePlugin.java                ← Example RoutePlugin class
│   ├── MyPluginTaskPlugin.java                 ← Example TaskPlugin class
│   └── MyPluginValisationPlugin.java           ← Example ValidationPlugin class
├── src/test/java/org/linagora/linid/im/myplugin/...
│   ├── MyPluginAuthorizationPluginTest.java    ← Example AuthorizationPlugin test class
│   ├── MyPluginRoutePluginTest.java            ← Example RoutePlugin test class
│   ├── MyPluginTaskPluginTest.java             ← Example TaskPlugin test class
│   └── MyPluginValisationPluginTest.java       ← Example ValidationPlugin test class
├── pom.xml
└── README.md
```

---

## ❌ What can be safely removed?

You can safely delete:

* The example plugin and test class (`MyPlugin****Plugin.java`, `MyPlugin****PluginTest.java`)

---

## ✅ Tips

* Update `groupId`, `artifactId`, and `version` in `pom.xml` with your own values.
* Update `<param>org.linagora.linid.im.myplugin.*</param>` in `pom.xml` to make pitest work.

---

## 📄 License

This template is released under the **LGPL-3.0** license by default.
You can change the license according to your project or client requirements.
