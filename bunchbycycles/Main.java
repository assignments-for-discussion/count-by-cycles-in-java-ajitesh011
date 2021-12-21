package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
     int c=0;
    int b=0;
    int d=0;
    for (int i=0; i<cycles.length;i++)
    {
        if(cycles[i]<150)
        {
            c++;
        }
        else if(cycles[i]>150 && cycles[i]<=649)
        {
            b++;
        }
        else
        {
            d++;
        }
        
        
    }
    counts.lowCount=c;
    counts.mediumCount=b;
    counts.highCount=d;
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 1);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 2);
    System.out.println("Done counting :)\n");
     System.out.println("No. of low are",counts.lowCount);
    System.out.println("No. of medium are",counts.mediumCount);
    System.out.println("No. of high are",counts.highCount);
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
