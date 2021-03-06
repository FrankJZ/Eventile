package grails3.example

class UrlMappings {

    static mappings = {
        "/api/search"(controller: "search", action: "search", method: "GET", parseRequest: true)
        "/api/signup"(controller: "user", action: "signUp", method: "POST")

        "/api/user"(controller:"user", action: "show_user", method: "GET")

        "/api/user/edit"(controller:"user", action: "edit", method: "PUT", parseRequest: true)

        "/"(view:"/index")
        "/**"(view:"/index")

        "/view/event"(controller: "event", action: "show", method: "GET", parseRequest: true)

        "/api/event/update_rating"(controller: "event", action: "update_rating", method: "PUT")

        "/api/event/update_comments"(controller: "comment", action: "update_comment", method: "PUT")

        "/api/event/create_event"(controller: "event", action: "create_event", method: "POST", parseRequest: true)

        "/api/event/get_user_created_events"(controller: "event", action: "get_user_created_events", method: "GET", parseRequest: true)

        "/welcome_search"(controller: "welcome", action:"search", method: "GET", parseRequest: true)

        "/api/dashboard"(controller: "dashboard", action:"search", method: "GET", parseRequest: true)

        "/api/user/addRSVP"(controller: "user", action: "add_user_RSVP", method: "PUT")

        "/api/user/removeRSVP"(controller: "user", action: "remove_user_RSVP", method: "PUT")

        "/api/user/get_user_rsvp_events"(controller: "user", action: "get_rsvp_events", method: "GET", parseRequest: true)

        "/api/user/get_user_rated_events"(controller: "user", action: "get_user_rated_events", method: "GET", parseRequest: true)

        "/api/user/get_users_rating"(controller: "user", action: "get_users_rating", method: "GET", parseRequest: true)

        "/api/event/show_rated_event"(controller: "event", action: "show_rated_event", method: "GET", parseRequest: true)

        "/api/event/show_created_event"(controller: "event", action: "show_created_event", method: "GET", parseRequest: true)
        "/show_created_event_public"(controller: "event", action: "get_related_events_public", method: "GET", parseRequest: true)


        "/api/event/check_user_rsvp"(controller: "event", action: "check_if_user_rsvpd", method: "GET", parseRequest: true)

        "/api/user/add_first_time"(controller: "user", action: "add_user_first_time", method: "PUT")

        "/api/user/add_have_gone"(controller: "user", action: "add_user_have_gone", method: "PUT")

        "/api/user/remove_first_time"(controller: "user", action: "remove_user_first_time", method: "PUT")

        "/api/user/remove_have_gone"(controller: "user", action: "remove_user_have_gone", method: "PUT")

        "/api/user/get_first_time"(controller: "user", action: "get_first_time", method: "GET", parseRequest: true)

        "/api/user/get_have_gone"(controller: "user", action: "get_have_gone", method: "GET", parseRequest: true)



        "/api/event/get_related_events"(controller: "event", action: "get_related_events", method: "GET", parseRequest: true)
        "/get_related_events_public"(controller: "event", action: "get_related_events_public", method: "GET", parseRequest: true)


    }
}
