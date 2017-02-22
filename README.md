# -Factory-Service-Simulation-Software-FSSS-
A software to determine the optimum number of adjusters that factories should employ.

Develop the following simulation software:

A factory has different categories of machines such as lathe machines, turning machines, drilling machines,
soldering machines, etc. The factory can have different numbers of machines from each category such as 200
lathe machines, 50 turning machines, etc. These machines require frequent adjustments and repair. Each
category of machine fails uniformly after continuous operation and the failure profile of the different categories
of machines is given by its mean time to failure (MTTF). A certain number of adjusters are employed to keep the
machines running. The adjusters have expertise in maintaining different categories of machines. An adjuster
may be expert in maintaining more than one type of machine. A service manager coordinates the activities of
the adjusters. The service manager maintains a queue of inoperative machines. If there are machines waiting
to be repaired, the service manager assigns the machine at the front of the queue to the next available adjuster.
Likewise, when some adjusters are not busy, the service manager maintains a queue of idle adjusters and assigns
the adjuster at the front of the queue to the next machine that breaks down.
At any given time, one of the two queues will be empty. Thus, the service manager needs to maintain only a
single queue, which when it is not empty contains only machines or only adjusters. The factory management
wishes to get as much as possible out of its machines and adjusters. It is therefore interested in machine
utilization | the percentage of time a machine is up and running and the adjuster utilization | the percentage
of time an adjuster is busy. The goal of our simulation is then to see how the average machine and adjuster
utilization depend on such factors as the number of machines, the number of adjusters, the reliability of the
machines in terms of mean time to failure (MTTF). This software would be used by different factories to
determine the optimum number of adjusters that they should employ.
