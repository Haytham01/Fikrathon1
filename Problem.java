package Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Problem {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int input= Integer.parseInt(br.readLine());
        List<Integer> people= new ArrayList<>();
        for(int i=1; i<= input; i++){
            people.add(i);
        }

        while(people.size() > 1) {
            for (int i = 0; i < people.size(); i ++) {
                if(i == people.size()-1){
                    people.remove(0);
                }else {
                    people.remove(i + 1);
                }
            }
        }

        bw.write(people.get(0) + "\n");


        bw.flush();
        bw.close();
        br.close();
    }
}
