package org.linagora.linid.im.myplugin;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.linagora.linid.dmapicore.plugin.authorization.AbstractAuthorizationPlugin;
import org.linagora.linid.dmapicore.plugin.config.dto.RootConfiguration;
import org.linagora.linid.dmapicore.plugin.entity.DynamicEntity;
import org.linagora.linid.dmapicore.plugin.task.TaskExecutionContext;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

/**
 * MyPlugin authorization javadoc.
 */
@Slf4j
@Component
public class MyPluginAuthorizationPlugin extends AbstractAuthorizationPlugin {

  @Override
  public boolean supports(final @NonNull String type) {
    return "MyPlugin".equals(type);
  }

  @Override
  public void updateConfiguration(RootConfiguration configuration) {

  }

  @Override
  public void validateToken(HttpServletRequest request, TaskExecutionContext context) {

  }

  @Override
  public void isAuthorized(HttpServletRequest request, DynamicEntity entity, String action, TaskExecutionContext context) {

  }

  @Override
  public void isAuthorized(HttpServletRequest request, DynamicEntity entity, String id, String action,
                           TaskExecutionContext context) {

  }

  @Override
  public void isAuthorized(HttpServletRequest request, DynamicEntity entity, MultiValueMap<String, String> filters,
                           String action,
                           TaskExecutionContext context) {

  }
}
