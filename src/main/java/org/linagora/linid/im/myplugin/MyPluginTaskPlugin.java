package org.linagora.linid.im.myplugin;

import lombok.extern.slf4j.Slf4j;
import org.linagora.linid.dmapicore.plugin.config.dto.TaskConfiguration;
import org.linagora.linid.dmapicore.plugin.entity.DynamicEntity;
import org.linagora.linid.dmapicore.plugin.task.TaskExecutionContext;
import org.linagora.linid.dmapicore.plugin.task.TaskPlugin;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * MyPlugin task javadoc.
 */
@Slf4j
@Component
public class MyPluginTaskPlugin implements TaskPlugin {

  @Override
  public boolean supports(final @NonNull String type) {
    return "MyPlugin".equals(type);
  }

  @Override
  public void execute(final TaskConfiguration configuration,
                      final DynamicEntity entity,
                      final TaskExecutionContext context) {
    log.info("Executing task on task 'MyPlugin'");
  }
}
