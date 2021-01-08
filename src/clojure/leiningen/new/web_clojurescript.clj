(ns leiningen.new.web-clojurescript
  (:require [leiningen.new.templates :as t]))

(defn web-clojurescript
  [name package-name]
  (let [render (t/renderer "web-clojurescript")
        package-name (t/sanitize (t/multi-segment (or package-name name)))
        main-ns (t/sanitize-ns package-name)
        data {:name name
              :namespace main-ns
              :path (t/name-to-path main-ns)}]
    (t/->files data
               ["project.clj" (render "project.clj" data)]
               ["README.md" (render "README.md" data)]
               [".gitignore" (render "gitignore" data)]
               ["src/clj/{{path}}.clj" (render "server.clj" data)]
               ["src/cljs/{{path}}.cljs" (render "client.cljs" data)]
               ["resources/public/page.css" (render "page.css" data)])))
