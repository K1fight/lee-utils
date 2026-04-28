# Lee Utils 微服务

## 技术栈

- Spring Boot 3.2.5
- Spring Cloud 2023.0.1
- Java 17

## 已集成组件

| 组件 | 说明 |
|------|------|
| Spring Web | RESTful API 开发 |
| Eureka Client | 服务注册与发现 |
| OpenFeign | 声明式服务调用 |
| LoadBalancer | 客户端负载均衡 |
| Actuator | 健康检查与监控 |
| Lombok | 简化代码 |
| Validation | 参数校验 |

## 启动方式

### 前置条件
1. 启动 Eureka Server (端口 8761)
2. JDK 17+

### 启动服务
```bash
mvn spring-boot:run
```

服务启动后访问:
- 健康检查: http://localhost:8080/api/health
- Actuator: http://localhost:8080/actuator/health

## 项目结构

```
lee-utils/
├── src/main/java/com/lee/utils/
│   ├── LeeUtilsApplication.java    # 启动类
│   ├── config/                     # 配置类
│   ├── controller/                 # 控制器
│   ├── service/                    # 业务逻辑
│   ├── repository/                 # 数据访问
│   └── entity/                     # 实体类
└── src/main/resources/
    └── application.yml             # 配置文件
```

## 配置说明

| 配置项 | 默认值 | 说明 |
|--------|--------|------|
| server.port | 8080 | 服务端口 |
| spring.application.name | lee-utils | 服务名称 |
| eureka.client.service-url | localhost:8761 | 注册中心地址 |

## 后续扩展建议

1. **数据库**: 添加 spring-boot-starter-data-jpa 或 mybatis-plus
2. **缓存**: 添加 spring-boot-starter-data-redis
3. **消息队列**: 添加 spring-kafka 或 spring-boot-starter-amqp
4. **配置中心**: 集成 Spring Cloud Config 或 Nacos Config
5. **网关**: 通过 Spring Cloud Gateway 统一入口
