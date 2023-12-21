package ro.cyberdev.app.ws.userService;

import ro.cyberdev.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.request.UserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.response.UserRest;

import java.util.Collection;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);

    UserRest getUser(String userId);

    Collection<UserRest> getAllUsers();

    UserRest updateUser(String userId, UpdateUserDetailsRequestModel userDetails);

    void deleteUser(String userId);
}
