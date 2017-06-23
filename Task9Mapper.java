/**
 * <h1>Task9Mapper</h1>
 * Mapper program to calculate the total units sold for each Company
 * output will be sorted on the total units sold
 * This class will take input as (Key,Value) pair from Task8_1 and will
 * produce the output as (Key,Value) pair.
 * */
package mapreduce.assignment6.task9;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Task9Mapper extends Mapper<Text, IntWritable, IntWritable, Text> {
	public void map(Text key, IntWritable value, Context context) throws IOException, InterruptedException {
		//here we are taking output key of Task8_1 as value to produce output sorted on the total units sold
		context.write(value, key);
	}
}