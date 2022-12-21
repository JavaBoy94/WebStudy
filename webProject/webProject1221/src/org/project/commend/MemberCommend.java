package org.project.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemberCommend {

	abstract void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response);
}
