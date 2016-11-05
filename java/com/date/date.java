    http://localhost:9094/eb/udpateProblemTime.go
	
	<!-- add ztr -->
	<servlet>
		<servlet-name>udpateProblemTime</servlet-name>
		<servlet-class>com.geong.servlet.UdpateProblemTime</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>udpateProblemTime</servlet-name>
		<url-pattern>/udpateProblemTime.go</url-pattern>
	</servlet-mapping>
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //数据源
		Dao iDao =  (Dao)APPContext.getBean("iDao");
		
		// 7 月 6 号 , 到 现在 11 月 2号
		//时间 白天 9 点 到 晚上时间 9 时间,随机提问 

		//时间 随 id 分布.....
		
		Map map = new HashMap();
        map.put("id", 194);
        map.put("createtime", new Date());
		
        Date date = stringToDate("2016-7-15 09:00:00");
        List list = new ArrayList();
        
        for(int i=0;i<list.size();i++ ){
        	WtbObj wtb =  (WtbObj)list.get(i);
        	String type = wtb.getType();
        	Long id = wtb.getId();
        	
        	Object o  = iDao.update("wtb.updateCreatetime" ,map);  // 更新成功的个数 ?
        }
        
        System.out.println("更新时间开始.....");
		
		
		System.out.println("更新时间结束.....");
	}
	