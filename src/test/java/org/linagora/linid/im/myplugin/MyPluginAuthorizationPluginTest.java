package org.linagora.linid.im.myplugin;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.linagora.linid.dmapicore.plugin.authorization.AllowAllAuthorizationPlugin;
import org.linagora.linid.dmapicore.plugin.config.dto.RootConfiguration;
import org.linagora.linid.dmapicore.plugin.entity.DynamicEntity;
import org.linagora.linid.dmapicore.plugin.task.TaskExecutionContext;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.LinkedMultiValueMap;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test class:  MyPluginAuthorizationPlugin")
class MyPluginAuthorizationPluginTest {

  @InjectMocks
  private MyPluginAuthorizationPlugin plugin;

  @Test
  @DisplayName("Test support: should return true only on MyPlugin")
  void testSupports() {
    assertTrue(plugin.supports("MyPlugin"));
    assertFalse(plugin.supports("Other"));
  }

  @Test
  @DisplayName("Test updateConfiguration: should not throw exception")
  void testUpdateConfiguration() {
    assertDoesNotThrow(() -> new AllowAllAuthorizationPlugin().updateConfiguration(Mockito.mock(RootConfiguration.class)));
  }

  @Test
  @DisplayName("Test validateToken: should not throw exception")
  void testValidateToken() {
    var request = Mockito.mock(HttpServletRequest.class);
    var context = new TaskExecutionContext();
    var entity = new DynamicEntity();
    var filters = new LinkedMultiValueMap<String, String>();

    assertDoesNotThrow(() -> new AllowAllAuthorizationPlugin().validateToken(request, context));
    assertDoesNotThrow(() -> new AllowAllAuthorizationPlugin().isAuthorized(request, entity, "read", context));
    assertDoesNotThrow(() -> new AllowAllAuthorizationPlugin().isAuthorized(request, entity, "123", "read", context));
    assertDoesNotThrow(() -> new AllowAllAuthorizationPlugin().isAuthorized(request, entity, filters, "read", context));
  }
}
