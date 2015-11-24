package com.flyer.shop.security;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flyer.shop.model.Authority;
import com.flyer.shop.model.Role;
import com.flyer.shop.model.User;
import com.flyer.shop.service.IAuthorityService;
import com.flyer.shop.service.IRoleService;
import com.flyer.shop.service.IUserService;

/**
 * 权限
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

	@Autowired
	private IUserService userService;

	@Autowired
	private IRoleService roleService;

	@Autowired
	private IAuthorityService authService;

	/**
	 * 权限检查
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String username = String.valueOf(principals.getPrimaryPrincipal());

		final User user = userService.selectUserByName(username);
		
		final List<Role> roleInfos = roleService.selectRolesByUserId(user
				.getId());
		for (Role role : roleInfos) {
			
			// 添加角色
			System.err.println(role);
			authorizationInfo.addRole(role.getRoleSign());
			final List<Authority> authoritys = authService
					.selectAuthoritysByRoleId(role.getId());
			for (Authority auth : authoritys) {
				// 添加权限
				System.err.println(auth);
				authorizationInfo.addStringPermission(auth
						.getAuthSign());
			}
		}
		return authorizationInfo;
	}

	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
		String password = new String((char[]) token.getCredentials());
		// 通过数据库进行验证
		final User authentication = userService.authentication(new User(
				username, password));
		if (authentication == null) {
			throw new AuthenticationException("用户名或密码错误.");
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				username, password, getName());
		return authenticationInfo;
	}

}
