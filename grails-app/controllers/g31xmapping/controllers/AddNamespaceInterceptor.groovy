package g31xmapping.controllers


class AddNamespaceInterceptor {

    AddNamespaceInterceptor() {
        matchAll()
    }

    boolean before() {
        params.namespace = controllerNamespace
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
