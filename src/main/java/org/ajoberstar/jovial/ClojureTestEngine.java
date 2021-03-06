package org.ajoberstar.jovial;

import org.ajoberstar.jovial.util.SimpleClojure;
import org.junit.platform.engine.ConfigurationParameters;

public class ClojureTestEngine extends BaseClojureEngine {
  public static final String ENGINE_ID = "org.ajoberstar.jovial.clojure-test";

  @Override
  public String getId() {
    return ENGINE_ID;
  }

  @Override
  protected Object getEngine(ConfigurationParameters config) {
    return SimpleClojure.invoke("org.ajoberstar.jovial.engine.clojure-test", "engine", config);
  }
}
