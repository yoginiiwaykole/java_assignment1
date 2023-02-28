public class Calculator{
        public double performAddition(double[] numbers) {
          return numbers[0] + numbers[1];
        }
        
        public double performSubtraction(double[] numbers) {
          return numbers[0] - numbers[1];
        }
        
        public double performMultiplication(double[] numbers) {
          return numbers[0] * numbers[1];
        }
        
        public double performDivision(double[] numbers) {
          return numbers[0] / numbers[1];
        }
      
        public double sumArray(double[] array) {
          double sum = 0;
          for (double num : array) {
            sum += num;
            }
            return sum;
        }
      
        public double varianceArray(double[] array) {
          double mean = sumArray(array) / array.length;
          double variance = 0;
          for (double num : array) {
            variance += Math.pow(num - mean, 2);
          }
          return variance / array.length;
        }
      
        public double standardDeviationArray(double[] array) {
          return Math.sqrt(varianceArray(array));
        }
      
}
