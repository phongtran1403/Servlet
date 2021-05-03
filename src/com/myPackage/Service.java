package com.myPackage;

import java.util.ArrayList;
import java.util.List;

public class Service {
	public static List<Model> ExportModel() {
		List<Model> list =new ArrayList<Model>();
		list.add(new Model("Phong Trần", "Học viên"));
		list.add(new Model("Jsp", "Servlet"));
		return list;

	}
}
