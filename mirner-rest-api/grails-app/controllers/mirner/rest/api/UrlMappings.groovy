package mirner.rest.api

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        "/mirner/mirns/search"(controller: "mirns", action: "search")
        "/mirner/mirns/scopes"(controller: "mirns", action: "scopes")
        "/mirner/mirns/"(controller: "mirns", action: "index")
        "/"(view: "/index")
        "500"(view: '/error.gson')
        "404"(view: '/notFound.gson')
    }
}
