##常用依赖
···xml

##注解说明
-@Autowired:自动装配通过类型，名字
    如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，可以使用【@Qualifier(value = "beanid")】去配置【@Qualifier(value = "beanid")】的使用，指定一个唯一的bean对象注入
-@Nullable
    字段标记了这个注解，表明这个字段可以为Null
-@Resource:自动装配通过名字，类型
-@Component
-@Value
-@Configuration
-@Bean

