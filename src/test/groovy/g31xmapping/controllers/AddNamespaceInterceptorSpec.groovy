package g31xmapping.controllers


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AddNamespaceInterceptor)
class AddNamespaceInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test addNamespace interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"addNamespace")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
