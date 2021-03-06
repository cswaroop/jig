;; Copyright © 2013 - 2014, JUXT LTD. All Rights Reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound by the
;; terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(load-file "project-header.clj")

(def jig-version (get-version))

(defproject mqtt-broker "0.1.0-SNAPSHOT"
  :description "An example to demonstrate a simple jig running a MQTT protocol broker on Netty"
  :url "https://github.com/juxt/jig/tree/master/examples/mqtt-broker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[jig/netty ~jig-version]
                 [jig/netty-mqtt ~jig-version]])
