(defproject nightpad "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[nightcode "1.3.1"
                  :exclusions [gwt-plugin
                               leiningen
                               lein-ancient
                               lein-cljsbuild
                               lein-clr
                               lein-droid
                               lein-typed
                               play-clj/lein-template]]
                 [org.clojure/clojure "1.8.0"]
                 [seesaw "1.4.5"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [nightpad.core]
  :main nightpad.core)
