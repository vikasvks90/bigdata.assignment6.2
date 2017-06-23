/**
 * <h1>Task9Reducer</h1>
 * Reducer program to calculate the total units sold for each Company
 * output will be sorted on the total units sold
 * This class will take input as (Key,Value) pair from output of mapper class
 * value will be a combined list for all the values for a given key
 * */
package mapreduce.assignment6.task9;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Task9Reducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	IntWritable outValue = new IntWritable();
	
	public void reduce(IntWritable key, Iterable<Text> values,Context context) throws IOException, InterruptedException{
		for (Text value : values) {
			context.write(value, key);
		}
	}
}