aspect KeenAspectAj {

  pointcut methodsOfInterest(): execution(* *(..)) &&
                              !within(KeenAspectAj);

  private int nesting = 0;

  Object around(): methodsOfInterest() {
    nesting++;
    long stime=System.currentTimeMillis();
    Object o = proceed();
    long etime=System.currentTimeMillis();
    nesting--;
    StringBuilder info = new StringBuilder();
    for (int i=0;i<nesting;i++) {
      info.append("  ");
    }
    info.append(thisJoinPoint+" took "+(etime-stime)+"ms");
    System.out.println(info.toString());
    return o;
  }
}