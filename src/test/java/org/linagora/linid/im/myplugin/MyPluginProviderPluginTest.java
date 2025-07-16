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
@DisplayName("Test class: MyPluginProviderPlugin")
class MyPluginProviderPluginTest {


  @InjectMocks
  private MyPluginProviderPlugin plugin;

  @Test
  @DisplayName("Test support: should return true only on MyPlugin")
  void testSupports() {
    assertTrue(plugin.supports("MyPlugin"));
    assertFalse(plugin.supports("Other"));
  }

  @Test
  @DisplayName("Test create: should return null")
  void testCreate() {
    assertNull(plugin.create(null, null, null));
  }

  @Test
  @DisplayName("Test update: should return null")
  void testUpdate() {
    assertNull(plugin.update(null, null, null, null));
  }

  @Test
  @DisplayName("Test patch: should return null")
  void testPatch() {
    assertNull(plugin.patch(null, null, null, null));
  }

  @Test
  @DisplayName("Test delete: should return null")
  void testDelete() {
    assertFalse(plugin.delete(null, null, null, null));
  }

  @Test
  @DisplayName("Test findById: should return null")
  void testFindById() {
    assertNull(plugin.findById(null, null, null, null));
  }

  @Test
  @DisplayName("Test findAll: should return null")
  void testFindAll() {
    assertNull(plugin.findAll(null, null, null, null, null));
  }
}
