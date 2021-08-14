using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Calculator - C#");
            int val1 = int.Parse(Console.ReadLine());
            string str = Console.ReadLine();
            int val2 = int.Parse(Console.ReadLine());

            Console.WriteLine("=");

            if (str == "+")
            {
                int val3 = val1 + val2;
                Console.WriteLine(val3);
            }
            else if (str == "-")
            {
                int val3 = val1 - val2;
                Console.WriteLine(val3);
            }
            else if (str == "*")
            {
                int val3 = val1 * val2;
                Console.WriteLine(val3);
            }
            else if (str == "/")
            {
                int val3 = val1 / val2;
                Console.WriteLine(val3);
            }
            Console.ReadKey();
        }
    }
}
