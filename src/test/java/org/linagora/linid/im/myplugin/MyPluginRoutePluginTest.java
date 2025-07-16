package org.linagora.linid.im.myplugin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.linagora.linid.dmapicore.plugin.route.RouteDescription;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test class: MyPluginRoutePlugin")
class MyPluginRoutePluginTest {

  @InjectMocks
  private MyPluginRoutePlugin plugin;

  @Test
  @DisplayName("Test support: should return true only on MyPlugin")
  void testSupports() {
    assertTrue(plugin.supports("MyPlugin"));
    assertFalse(plugin.supports("Other"));
  }

  @Test
  @DisplayName("Test getRoutes: should return true only on MyPlugin")
  void testGetRoutes() {
    var expected = List.of(new RouteDescription("GET", "/myPlugin", null, List.of()));
    assertEquals(expected, plugin.getRoutes(List.of()));
  }

  @Test
  @DisplayName("Test match: should return true on valid route")
  void testMatch() {
    assertTrue(plugin.match("/api/MyPlugin", "GET"));
    assertFalse(plugin.match("Other", "GET"));
  }

  @Test
  @DisplayName("Test execute: should return ok response")
  void testExecute() {
    var response = plugin.execute(null);

    assertNotNull(response);
    assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
    assertEquals("MyPlugin route", response.getBody());
  }
}
