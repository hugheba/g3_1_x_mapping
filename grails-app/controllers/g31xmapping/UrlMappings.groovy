package g31xmapping

class UrlMappings {

    static mappings = {

        group("/main") {
            "/" {
                namespace = g31xmapping.controllers.main.IndexController.namespace
                controller = 'index'
                action = 'index'
            }
            "/page2" {
                namespace = g31xmapping.controllers.main.IndexController.namespace
                controller = 'index'
                action = 'page2'
            }
            "/page3" {
                namespace = g31xmapping.controllers.main.IndexController.namespace
                controller = 'index'
                action = 'page3'
            }
        }

        group("/account") {
            "/" {
                namespace = g31xmapping.controllers.account.IndexController.namespace
                controller = 'index'
                action = 'index'
            }
            "/$controller/$action?" {
                namespace = g31xmapping.controllers.account.IndexController.namespace
            }
        }

        "/$namespace/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(namespace: g31xmapping.controllers.main.IndexController.namespace, controller: 'index', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
