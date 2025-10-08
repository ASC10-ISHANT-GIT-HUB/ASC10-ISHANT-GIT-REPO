#the import sys module to access cmd line arguments
import sys
#the syntax sys.argv[1.] gets all arguments except the script name. 
# The script name is always the first argument (sys.argc[0]). 
# The slice [1.] means "from the second element to the end of the list".
# sys.argv is a list in Python, which contains the command-line arguments passed to the script.
# The first element, sys.argv[0], is the name of the script itself.
# The subsequent elements, sys.argv[1], sys.argv[2], etc., are the additional arguments passed to the script. 
print("Script Name:", sys.argv[0])
#print all arguments
for arg in sys.argv[1:]:
    print("Argument:", arg)
if len(sys.argv) > 1:
    print("Arguments passed:", sys.argv[1:])
else:
    print("No arguments passed")

#to run this script use the command:
# python main2.py arg1 arg2 arg3 arg4 arg5 arg6


