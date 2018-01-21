package com.ocean.vampire.dao.user;

import com.ocean.vampire.domain.user.User;

public interface Userdao {

    User select(Long id);

    Integer insert(User user);
}
