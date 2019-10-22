# Karaf 4 Playground 

## Codebase structure

* `modules`: Aggregates OSGi bundles.
  * `api-interface-1`: Exposed `ResponderService`, an interface to be referenced in consuming bundles.
  * `api-impl-1`: Implements `ResponderService`. Annotated with OSGi compendium `@Component`.
  * `api-consumer-1`: Implements a consumer of `ResponderService` interface. Referenced by `@Reference(target = "(type=world)"...`. 
  * `api-consumer-2`: Implements a consumer of `ResponderService` interface. Referenced by `@Reference(target = "(type=hello)"...`. 
* `assembly`: Builds a custom Karaf 4 distribution using Karaf Maven plugin with `<packaging>karaf-assembly</packaging>`.
  * `resources/etc`: Contains `.cfg` files to initiate two instances of `ResponderService`. These configs carry a `type` field which is used for differentiating instances to be bound to consumers.
* `features`: Aggregates OSGi features being build into custom Karaf 4 distribution.
  * `feature-1`: aggreates `api-interface-1` and `api-impl-1`. This is a boot feature.
  * `feature-2`: aggreates `api-consumer-1` and `api-consumer-2`. This is **not** a boot feature, its just installed.

## Build Stack
* Karaf 4.2.6
* `org.osgi:org.osgi.core:5.0.0`
* `org.osgi:org.osgi.compendium:5.0.0`
* `org.apache.felix:maven-scr-plugin:1.26.0` to generate SCR descriptors for annotated components from `api-impl-1`, `api-consumer-1`, `api-consumer-2`.
* `org.apache.felix:org.apache.felix.scr.ds-annotations:1.2.10` to enable Felix SCR plugin to process `org.osgi.compendium` annotations. See: https://felix.apache.org/documentation/subprojects/apache-felix-maven-scr-plugin/apache-felix-maven-scr-plugin-use.html
