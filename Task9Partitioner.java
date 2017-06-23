/**
 * <h1>Task9Partitioner</h1>
 * Partitioner program to which will get the output of mapper as input and will ensure that a particular
 * key goes to a particular reducer
 * */
package mapreduce.assignment6.task9;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class Task9Partitioner extends Partitioner<IntWritable, Text> {
	@Override
	public int getPartition(IntWritable key, Text value, int numPartitions) {
		int sales = key.get();
		int partitionNumber;
		//if total units sold are between 0 to 5 1st partitioner will be used 
		if (sales >= 0 && sales < 5) {
			partitionNumber = 0;
		}
		//else 2nd partitioner will be used
		else {
			partitionNumber = 1;
		}
		return partitionNumber;
	}
}
