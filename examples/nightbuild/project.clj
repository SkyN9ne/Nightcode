(defproject nightbuild "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[nightcode "1.3.1"]
                 [org.clojure/clojure "1.8.0"]
                 [seesaw "1.4.5"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [nightbuild.core]
  :main nightbuild.core)
