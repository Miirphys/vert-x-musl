FROM ghcr.io/graalvm/native-image-community:23-muslib AS builder

WORKDIR /build

RUN microdnf install -y maven

COPY pom.xml .

COPY src ./src

RUN mvn package -Pnative

FROM scratch AS target

WORKDIR /app

COPY --from=builder /build/target/app ./app

ENTRYPOINT ["./app","-Djava.io.tmpdir=/app/tmp"]

