package com.customer.order.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;

@Configuration
public class DynamoDbConfigration {

    public  DynamoDBMapper dynamoDBMapper(){
        return new DynamoDBMapper(this.createDynamoDbClient());
    }

    public static AWSCredentials awsCredentials(){
       return new BasicAWSCredentials("", "");
   }

    public  AmazonDynamoDB createDynamoDbClient(){
        Region region = Region.US_WEST_2;
        return  AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(this.awsCredentials()))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8083","us-west-2"))
                .build();
    }

}
