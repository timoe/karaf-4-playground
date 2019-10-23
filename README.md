# Karaf 4 Playground 

## Codebase structure

* `modules`: Aggregates OSGi bundles.
  * `api-interface-1`: Exposes `ResponderService` and `SingleInstanceResponder`, interfaces to be referenced in consuming bundles.
  * `api-impl-1`: Implements interfaces from `api-interface-1`. Annotated with OSGi compendium `@Component`.
  * `api-consumer-1`: Implements a consumer of `ResponderService` interface. Referenced by `@Reference(target = "(type=world)"...`. 
  * `api-consumer-2`: Implements a consumer of `ResponderService` interface. Referenced by `@Reference(target = "(type=hello)"...`. 
  * `api-consumer-blueprint`: Implements a consumer being bootstrapped by blueprint, using a references pointing to `SingleInstanceResponder`.
* `assembly`: Builds a custom Karaf 4 distribution using Karaf Maven plugin with `<packaging>karaf-assembly</packaging>`.
  * `resources/etc`: Contains `.cfg` files to initiate two instances of `ResponderService`. These configs carry a `type` field which is used for differentiating instances to be bound to consumers.
* `features`: Aggregates OSGi features being build into custom Karaf 4 distribution.
  * `feature-1`: aggreates `api-interface-1` and `api-impl-1`. This is a boot feature.
  * `feature-2`: aggreates `api-consumer-1` and `api-consumer-2`. This is **not** a boot feature, its just installed.

## Build Stack
* Karaf 4.2.6
* `org.osgi:org.osgi.core:6.0.0`
* `org.osgi:osgi.cmpn:6.0.0`
* `org.apache.felix:maven-scr-plugin:1.26.0` to generate SCR descriptors for annotated components from `api-impl-1`, `api-consumer-1`, `api-consumer-2`.
