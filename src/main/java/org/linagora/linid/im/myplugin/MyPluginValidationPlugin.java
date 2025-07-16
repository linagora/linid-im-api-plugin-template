package org.linagora.linid.im.myplugin;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.linagora.linid.dmapicore.i18n.I18nMessage;
import org.linagora.linid.dmapicore.plugin.config.dto.ValidationConfiguration;
import org.linagora.linid.dmapicore.plugin.validation.ValidationPlugin;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * MyPlugin validation javadoc.
 */
@Slf4j
@Component
public class MyPluginValidationPlugin implements ValidationPlugin {

  @Override
  public boolean supports(final @NonNull String type) {
    return "MyPlugin".equals(type);
  }

  @Override
  public Optional<I18nMessage> validate(final ValidationConfiguration configuration, final Object value) {
    log.info("Validation entity on validation 'MyPlugin'");
    return Optional.empty();
  }
}
