package org.linagora.linid.im.myplugin;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test class: MyPluginValidationPlugin")
class MyPluginValidationPluginTest {

  @InjectMocks
  private MyPluginValidationPlugin plugin;

  @Test
  @DisplayName("Test support: should return true only on MyPlugin")
  void testSupports() {
    assertTrue(plugin.supports("MyPlugin"));
    assertFalse(plugin.supports("Other"));
  }

  @Test
  @DisplayName("Test validate: should no error message")
  void testValidate() {
    var error = plugin.validate(null, null);

    assertTrue(error.isEmpty());
  }
}
