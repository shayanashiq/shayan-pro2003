class ARa{
    public static void main(String args[])
    {
        int month_days[];
       // String month_days[]=new String[12];
        //=new String[12];month_names[]
        String month_names[]={"jan","feb","march","aprial","may","june","july","aug","sep","oct","nov","dec"};

        month_days=new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=30;

        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        for(int i=0;i<=month_names.length;i++)
        {
            for(int a=0;a<=month_days.length;a++)
            {
                System.out.println("Days in "+month_names[i]+ " are ="+month_days[a]);
            }
            continue;
        }
    }

}