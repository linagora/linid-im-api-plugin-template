package org.linagora.linid.im.myplugin;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test class: MyPluginTaskPlugin")
class MyPluginTaskPluginTest {

  @InjectMocks
  private MyPluginTaskPlugin plugin;

  @Test
  @DisplayName("Test support: should return true only on MyPlugin")
  void testSupports() {
    assertTrue(plugin.supports("MyPlugin"));
    assertFalse(plugin.supports("Other"));
  }

  @Test
  @DisplayName("Test execute: should not throw exception")
  void testExecute() {
    Exception exception = null;

    try {
      plugin.execute(null, null, null);
    } catch (Exception e) {
      exception = e;
    }

    assertNull(exception);
  }
}
