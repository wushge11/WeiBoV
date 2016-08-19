package com.wsg.lovehome.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

  private final DaoConfig forumDaoConfig;
  private final DaoConfig userDaoConfig;

  private final ForumDao forumDao;
  private final UserDao userDao;

  public DaoSession(SQLiteDatabase db, IdentityScopeType type,
      Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap) {
    super(db);

    forumDaoConfig = daoConfigMap.get(ForumDao.class).clone();
    forumDaoConfig.initIdentityScope(type);

    userDaoConfig = daoConfigMap.get(UserDao.class).clone();
    userDaoConfig.initIdentityScope(type);

    forumDao = new ForumDao(forumDaoConfig, this);
    userDao = new UserDao(userDaoConfig, this);

    registerDao(Forum.class, forumDao);
    registerDao(User.class, userDao);
  }

  public void clear() {
    forumDaoConfig.getIdentityScope().clear();
    userDaoConfig.getIdentityScope().clear();
  }

  public ForumDao getForumDao() {
    return forumDao;
  }

  public UserDao getUserDao() {
    return userDao;
  }
}