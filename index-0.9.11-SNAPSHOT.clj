{:namespaces
 ({:doc
   "This api provides functions that can be executed from the Clojure tools using -X:deps.",
   :name "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli/clojure.tools.deps.cli.api-api.html",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj"}
  {:doc nil,
   :name "clojure.tools.deps.cli.help",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli/clojure.tools.deps.cli.help-api.html",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/6816c62f8faecbe7775a75aa1c02e0310d072c0d/src/main/clojure/clojure/tools/deps/cli/help.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "aliases",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L177",
   :line 177,
   :var-type "function",
   :arglists ([params]),
   :doc
   "List all aliases available for use with the CLI using -M, -X or -T execution\n(note that some aliases may be usable with more than one of these). Also, the\ndeps.edn sources of the alias are specified.\n\nThis program accepts the same basis-modifying arguments from the `basis` program.\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nFor example, to print only aliases defined in this project:\n  clj -X:deps aliases :root nil :user nil\n\nBasis options:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n\nThe aliases are printed to the console.",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/aliases"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "basis",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L40",
   :line 40,
   :var-type "function",
   :arglists ([params]),
   :doc
   "Create a basis from a set of deps sources and a set of aliases. By default, use\nroot, user, and project deps and no argmaps (essentially the same classpath you get by\ndefault from the Clojure CLI).\n\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nAliases refer to argmaps in the merged deps that will be supplied to the basis\nsubprocesses (tool, resolve-deps, make-classpath-map).\n\nThe following subprocess argmap args can be provided:\n  Key                  Subproc             Description\n  :replace-deps        tool                Replace project deps\n  :replace-paths       tool                Replace project paths\n  :extra-deps          resolve-deps        Add additional deps\n  :override-deps       resolve-deps        Override coord of dep\n  :default-deps        resolve-deps        Provide coord if missing\n  :extra-paths         make-classpath-map  Add additional paths\n  :classpath-overrides make-classpath-map  Replace lib path in cp\n\nOptions:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n  :aliases - coll of aliases of argmaps to apply to subprocesses\n\nReturns {:basis basis}, which basis is initial deps edn map plus these keys:\n  :resolve-args - the resolve args passed in, if any\n  :classpath-args - the classpath args passed in, if any\n  :libs - lib map, per resolve-deps\n  :classpath - classpath map per make-classpath-map\n  :classpath-roots - vector of paths in classpath order",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/basis"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "find-versions",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L417",
   :line 417,
   :var-type "function",
   :arglists ([{:keys [lib tool n], :or {n 8}, :as args}]),
   :doc
   "Find available tool versions given either a lib (with :lib) or\nexisting installed tool (with :tool). If lib, check all registered\nprocurers and print one coordinate per line when found.\n\nOptions:\n  :lib  Qualified lib symbol\n  :tool Tool name for installed tool\n  :n    Number of coordinates to return, default = 8, :all for all",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/find-versions"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "git-resolve-tags",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L287",
   :line 287,
   :var-type "function",
   :arglists ([_]),
   :doc "Resolve git tags in deps.edn git deps to full shas.",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/git-resolve-tags"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "list",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L231",
   :line 231,
   :var-type "function",
   :arglists ([params]),
   :doc
   "List all deps on the classpath, optimized for knowing the final set of included\nlibs. The `tree` program can provide more info on why or why not a particular\nlib is included.\n\nLicenses will be printed in short form by default but can also be listed as\nin :full or :none for none at all using the :license key.\n\nBy default, :format will :print to the console in a human friendly tree. Use\n:edn mode to print the tree to edn.\n\nThis program accepts the same basis-modifying arguments from the `basis` program.\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nOptions:\n  :license - :full, :short (default), :none\n\nOutput mode options:\n  :format    :print (default) or :edn\n\nBasis options:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n  :aliases - coll of kw aliases of argmaps to apply to subprocesses\n\nThe libs are printed to the console.",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/list"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "mvn-install",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L376",
   :line 376,
   :var-type "function",
   :arglists ([{:keys [jar pom lib version classifier local-repo]}]),
   :doc
   "Install a jar and pom to the Maven local cache.\nThe pom file must either be supplied, or generated based\non provided lib/version/classifier, or provided inside the jar.\nThe group/artifact/version coordinate will be pulled from the\npom source as above.\n\nRequired:\n  :jar (reqired) - path to jar file (embedded pom used by default)\n\nExplicit pom options:\n  :pom - path to pom file (pom in jar ignored)\n\nGenerated pom options:\n  :lib - qualified symbol like my.org/lib\n  :version - string\n  :classifier - string\n\nOther options:\n  :local-repo (optional) - path to local repo (default = ~/.m2/repository)\n\nExecute ad-hoc:\n  clj -X:deps mvn/install :jar '\"foo-1.2.3.jar\"'",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/mvn-install"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "mvn-pom",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L294",
   :line 294,
   :var-type "function",
   :arglists ([{:keys [argmaps], :as opts}]),
   :doc
   "Sync or create pom.xml from deps.edn.\n\nThis program accepts the same basis-modifying arguments from the `basis` program.\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nBasis options:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n  :aliases - coll of kw aliases of argmaps to apply to subprocesses\n\nDeprecated options (use the basis :aliases above instead):\n  :argmaps - vector of aliases to combine into argmaps to resolve-deps and make-classpath",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/mvn-pom"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "prep",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L78",
   :line 78,
   :var-type "function",
   :arglists
   ([{:keys [force log current],
      :or {log :info, current false},
      :as params}]),
   :doc
   "Prep the unprepped libs found in the transitive lib set of basis.\n\nThis program accepts the same basis-modifying arguments from the `basis` program.\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nOptions:\n  :force - flag on whether to force prepped libs to re-prep (default = false)\n  :current - flag on whether to prep current project too (default = false)\n  :log - :none, :info (default), or :debug\n\nBasis options:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n  :aliases - coll of kw aliases of argmaps to apply to subprocesses\n\nReturns params used.",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/prep"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj",
   :name "tree",
   :file "src/main/clojure/clojure/tools/deps/cli/api.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/ff55dcfd459e13ecf69c9873ddb2c83be97908c0/src/main/clojure/clojure/tools/deps/cli/api.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([opts]),
   :doc
   "Print deps tree for the current project's deps.edn built from either the\na basis, or if provided, the trace file.\n\nThis program accepts the same basis-modifying arguments from the `basis` program.\nEach dep source value can be :standard, a string path, a deps edn map, or nil.\nSources are merged in the order - :root, :user, :project, :extra.\n\nBy default, :format will :print to the console in a human friendly tree. Use\n:edn mode to print the tree to edn.\n\nIn print mode, deps are printed with prefix of either . (included) or X (excluded).\nA reason code for inclusion/exclusion may be added at the end of the line.\n\nBasis options:\n  :root    - dep source, default = :standard\n  :user    - dep source, default = :standard\n  :project - dep source, default = :standard (\"./deps.edn\")\n  :extra   - dep source, default = nil\n  :aliases - coll of kw aliases of argmaps to apply to subprocesses\n\nInput options (if provided, basis options ignored):\n  :file      Path to trace.edn file (from clj -Strace) to use in computing the tree\n\nOutput mode:\n  :format    :print (default) or :edn\n\nPrint output mode modifiers:\n  :indent    Indent spacing (default = 2)\n  :hide-libs Set of libs to hide as deps (if not top dep), default = #{org.clojure/clojure}",
   :namespace "clojure.tools.deps.cli.api",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.api-api.html#clojure.tools.deps.cli.api/tree"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/6816c62f8faecbe7775a75aa1c02e0310d072c0d/src/main/clojure/clojure/tools/deps/cli/help.clj",
   :name "dir",
   :file "src/main/clojure/clojure/tools/deps/cli/help.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/6816c62f8faecbe7775a75aa1c02e0310d072c0d/src/main/clojure/clojure/tools/deps/cli/help.clj#L69",
   :line 69,
   :var-type "function",
   :arglists ([{:keys [ns], :as args}]),
   :doc
   "Prints a sorted directory of public vars in a namespace. If a namespace is not\nspecified :ns-default is used instead.",
   :namespace "clojure.tools.deps.cli.help",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.help-api.html#clojure.tools.deps.cli.help/dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.deps.cli/raw/6816c62f8faecbe7775a75aa1c02e0310d072c0d/src/main/clojure/clojure/tools/deps/cli/help.clj",
   :name "doc",
   :file "src/main/clojure/clojure/tools/deps/cli/help.clj",
   :source-url
   "https://github.com/clojure/tools.deps.cli/blob/6816c62f8faecbe7775a75aa1c02e0310d072c0d/src/main/clojure/clojure/tools/deps/cli/help.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([{:keys [ns fn], :as args}]),
   :doc
   "Print doc for the specified namespace or function. If neither is specified, print docs\nfor :ns-default.\n\nOptions:\n  :ns Print docs for namespace\n  :fn Print docs for function",
   :namespace "clojure.tools.deps.cli.help",
   :wiki-url
   "https://clojure.github.io/tools.deps.cli//clojure.tools.deps.cli.help-api.html#clojure.tools.deps.cli.help/doc"})}
