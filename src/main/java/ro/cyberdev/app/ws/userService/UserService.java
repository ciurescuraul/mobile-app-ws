package ro.cyberdev.app.ws.userService;

import ro.cyberdev.app.ws.ui.model.request.UserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
