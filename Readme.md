# Monitoring Micrometer + Prometheus

| Table of content|
| ------------------- |
| [1. Description](#description)|
| [2. Running the project](#running-the-project)|
| - [1.1 Local](#running-locally)|
| [3. Pending](#pending)|

## Description

Sample project for monitoring using micrometer and prometheus.

Discovery of services is done through Eureka using the [consul-adapter](https://github.com/twinformatics/eureka-consul-adapter) 

## Running the project

### Running locally

Start the services independently.

```bash
./gradlew build
java -jar build/libs/*.jar
```

Then run prometheus on docker, build the image:

```bash
docker build -t goofyahead/prometheus . 
```

and Run it:

```bash
docker run -p 9090:9090 goofyahead/prometheus
```


## Pending

- [ ] Expose only /health & /prometheus endpoint and secure it

- [ ] Make prometheus use a M2M token

## Links

https://spring.io/blog/2018/03/16/micrometer-spring-boot-2-s-new-application-metrics-collector

Backport to spring 1.5 -> https://micrometer.io/docs/ref/spring/1.5

https://www.callicoder.com/spring-boot-actuator-metrics-monitoring-dashboard-prometheus-grafana/

https://github.com/twinformatics/eureka-consul-adapter

https://prometheus.io/docs/prometheus/latest/configuration/configuration/#%3Cconsul_sd_config%3E

https://blog.pvincent.io/2017/12/prometheus-blog-series-part-1-metrics-and-labels/

https://medium.com/htc-research-engineering-blog/build-a-monitoring-dashboard-by-prometheus-grafana-741a7d949ec2

https://touk.pl/blog/2018/03/05/spring-boot-2-0-http-request-metrics-with-micrometer/

https://micrometer.io/docs/ref/spring/1.5

https://www.codeprimers.com/metrics-collection-in-spring-boot-with-micrometer-and-prometheus/

https://cloud.ibm.com/docs/java?topic=java-spring-metrics

