(defproject {{app-name}} "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  
  :dependencies [[com.badlogicgames.gdx/gdx "1.9.3"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.9.3"]
                 [com.badlogicgames.gdx/gdx-box2d "1.9.3"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.9.3"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.9.3"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.9.3"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.9.3"
                  :classifier "natives-desktop"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  
  :java-source-paths ["src" "src-common"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot :all
  :main {{desktop-namespace}})
