package org.linagora.linid.im.myplugin;

import lombok.extern.slf4j.Slf4j;
import org.linagora.linid.dmapicore.plugin.config.dto.ProviderConfiguration;
import org.linagora.linid.dmapicore.plugin.entity.DynamicEntity;
import org.linagora.linid.dmapicore.plugin.provider.ProviderPlugin;
import org.linagora.linid.dmapicore.plugin.task.TaskExecutionContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

/**
 * MyPlugin provider javadoc.
 */
@Slf4j
@Component
public class MyPluginProviderPlugin implements ProviderPlugin {

  @Override
  public boolean supports(final @NonNull String type) {
    return "MyPlugin".equals(type);
  }

  @Override
  public DynamicEntity create(final TaskExecutionContext context,
                              final ProviderConfiguration configuration,
                              final DynamicEntity dynamicEntity) {
    log.info("Creating new entity on provider 'MyPlugin'");
    return null;
  }

  @Override
  public DynamicEntity update(final TaskExecutionContext context,
                              final ProviderConfiguration configuration,
                              final String id,
                              final DynamicEntity dynamicEntity) {
    log.info("Updating entity on provider 'MyPlugin'");
    return null;
  }

  @Override
  public DynamicEntity patch(final TaskExecutionContext context,
                             final ProviderConfiguration configuration,
                             final String id,
                             final DynamicEntity dynamicEntity) {
    log.info("Patching entity on provider 'MyPlugin'");
    return null;
  }

  @Override
  public boolean delete(final TaskExecutionContext context,
                        final ProviderConfiguration configuration,
                        final String id,
                        final DynamicEntity dynamicEntity) {
    log.info("Delete entity on provider 'MyPlugin'");
    return false;
  }

  @Override
  public DynamicEntity findById(final TaskExecutionContext context,
                                final ProviderConfiguration configuration,
                                final String id,
                                final DynamicEntity dynamicEntity) {
    log.info("Finding entity by id on provider 'MyPlugin'");
    return null;
  }

  @Override
  public Page<DynamicEntity> findAll(final TaskExecutionContext context,
                                     final ProviderConfiguration configuration,
                                     final MultiValueMap<String, String> filters,
                                     final Pageable pageable,
                                     final DynamicEntity dynamicEntity) {
    log.info("Finding all entities on provider 'MyPlugin'");
    return null;
  }
}
