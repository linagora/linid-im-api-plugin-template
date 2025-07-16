package org.linagora.linid.im.myplugin;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.linagora.linid.dmapicore.plugin.config.dto.EntityConfiguration;
import org.linagora.linid.dmapicore.plugin.route.AbstractRoutePlugin;
import org.linagora.linid.dmapicore.plugin.route.RouteDescription;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * MyPlugin task javadoc.
 */
@Slf4j
@Component
public class MyPluginRoutePlugin extends AbstractRoutePlugin {

  @Override
  public boolean supports(final @NonNull String type) {
    return "MyPlugin".equals(type);
  }

  @Override
  public List<RouteDescription> getRoutes(List<EntityConfiguration> list) {
    return List.of(new RouteDescription("GET", "/myPlugin", null, List.of()));
  }

  @Override
  public boolean match(final String url, final String method) {
    return url.endsWith("/api/MyPlugin");
  }

  @Override
  public ResponseEntity<?> execute(final HttpServletRequest request) {
    log.info("Receiving request on route 'MyPlugin'");
    return ResponseEntity.ok("MyPlugin route");
  }
}
