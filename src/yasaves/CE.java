package yasaves;

import javax.swing.JPanel;

public class CE { //Carpetas Estrutura
	
	static boolean[] b = {true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,
						  false,false,false,false,false,false,false,false,false,false,false,false,false};
	static boolean pc2 = VC.pc;
	
	
	public final static void setb(int f) {
		
		byte r = (byte)(Math.random()*f);
		
		switch(f) {
		
		case 2:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
					
			}else{
					
				b[0] = false;
				b[1] = true;
					
			}
				
			carpetas cb = new carpetas(0,0,b[0]);
			carpetas cm1 = new carpetas(0,1,b[1]);
			
			cb.CV();
			cm1.CV();
			
			break;
		
		case 3:
			
			if(r == 0) {
					
				b[0] = true;
				b[1] = false;
				b[2] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
					
			}else {
					
				b[0] = false;
				b[1] = false;
				b[2] = true;
					
			}
				
			carpetas cbb = new carpetas(0,0,b[0]);
			carpetas cmm1 = new carpetas(0,1,b[1]);
			carpetas cmm2 = new carpetas(0,2,b[2]);
				
			cbb.CV();
			cmm1.CV();
			cmm2.CV();
			
			break;
			
		case 5:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				
			}else if(r == 2) {
				
				b[0] = false;
				b[1] = false;
				b[2] = true;
				b[3] = false;
				b[4] = false;
				
			}else if(r == 3) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = true;
				b[4] = false;
				
			}else {
					
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = true;
					
			}
				
			carpetas cbbb = new carpetas(0,0,b[0]);
			carpetas cmmm1 = new carpetas(0,1,b[1]);
			carpetas cmmm2 = new carpetas(0,2,b[2]);
			carpetas cmmm3 = new carpetas(0,1,b[3]);
			carpetas cmmm4 = new carpetas(0,2,b[4]);
				
			cbbb.CV();
			cmmm1.CV();
			cmmm2.CV();
			cmmm3.CV();
			cmmm4.CV();
			
			break;
			
		case 7:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				
			}else if(r == 2) {
				
				b[0] = false;
				b[1] = false;
				b[2] = true;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				
			}else if(r == 3) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = true;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				
			}else if(r == 4) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = true;
				b[5] = false;
				b[6] = false;
				
			}else if(r == 5) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = true;
				b[6] = false;
				
			}else {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = true;

				
			}
				
			carpetas cbbbb = new carpetas(0,0,b[0]);
			carpetas cmmmm1 = new carpetas(0,1,b[1]);
			carpetas cmmmm2 = new carpetas(0,2,b[2]);
			carpetas cmmmm3 = new carpetas(0,1,b[3]);
			carpetas cmmmm4 = new carpetas(0,2,b[4]);
			carpetas cmmmm5 = new carpetas(0,1,b[5]);
			carpetas cmmmm6 = new carpetas(0,2,b[6]);
				
			cbbbb.CV();
			cmmmm1.CV();
			cmmmm2.CV();
			cmmmm3.CV();
			cmmmm4.CV();
			cmmmm5.CV();
			cmmmm6.CV();
			
			break;
			
		case 10:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 2) {
				
				b[0] = false;
				b[1] = false;
				b[2] = true;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 3) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = true;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 4) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = true;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 5) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = true;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 6) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = true;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 7) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = true;
				b[8] = false;
				b[9] = false;
				
			}else if(r == 8) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = true;
				b[9] = false;
				
			}else {
					
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = true;
					
			}
				
			carpetas cbbbbb = new carpetas(0,0,b[0]);
			carpetas cmmmmm1 = new carpetas(0,1,b[1]);
			carpetas cmmmmm2 = new carpetas(0,2,b[2]);
			carpetas cmmmmm3 = new carpetas(0,1,b[3]);
			carpetas cmmmmm4 = new carpetas(0,2,b[4]);
			carpetas cmmmmm5 = new carpetas(0,1,b[5]);
			carpetas cmmmmm6 = new carpetas(0,2,b[6]);
			carpetas cmmmmm7 = new carpetas(0,1,b[7]);
			carpetas cmmmmm8 = new carpetas(0,2,b[8]);
			carpetas cmmmmm9 = new carpetas(0,2,b[9]);
			
				
			cbbbbb.CV();
			cmmmmm1.CV();
			cmmmmm2.CV();
			cmmmmm3.CV();
			cmmmmm4.CV();
			cmmmmm5.CV();
			cmmmmm6.CV();
			cmmmmm7.CV();
			cmmmmm8.CV();
			cmmmmm9.CV();
			
			break;
			
		case 15:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 2) {
				
				b[0] = false;
				b[1] = false;
				b[2] = true;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 3) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = true;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 4) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = true;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 5) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = true;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 6) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = true;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 7) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = true;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 8) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = true;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 9) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = true;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 10) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = true;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 11) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = true;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 12) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = true;
				b[13] = false;
				b[14] = false;
				
			}else if(r == 13) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = true;
				b[14] = false;
				
			}else {
					
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = true;
					
			}
				
			carpetas cbbbbbb = new carpetas(0,0,b[0]);
			carpetas cmmmmmm1 = new carpetas(0,1,b[1]);
			carpetas cmmmmmm2 = new carpetas(0,2,b[2]);
			carpetas cmmmmmm3 = new carpetas(0,1,b[3]);
			carpetas cmmmmmm4 = new carpetas(0,2,b[4]);
			carpetas cmmmmmm5 = new carpetas(0,1,b[5]);
			carpetas cmmmmmm6 = new carpetas(0,2,b[6]);
			carpetas cmmmmmm7 = new carpetas(0,1,b[7]);
			carpetas cmmmmmm8 = new carpetas(0,2,b[8]);
			carpetas cmmmmmm9 = new carpetas(0,2,b[9]);
			carpetas cmmmmmm10 = new carpetas(0,1,b[10]);
			carpetas cmmmmmm11 = new carpetas(0,2,b[11]);
			carpetas cmmmmmm12 = new carpetas(0,1,b[12]);
			carpetas cmmmmmm13 = new carpetas(0,2,b[13]);
			carpetas cmmmmmm14 = new carpetas(0,2,b[14]);
				
			cbbbbbb.CV();
			cmmmmmm1.CV();
			cmmmmmm2.CV();
			cmmmmmm3.CV();
			cmmmmmm4.CV();
			cmmmmmm5.CV();
			cmmmmmm6.CV();
			cmmmmmm7.CV();
			cmmmmmm8.CV();
			cmmmmmm9.CV();
			cmmmmmm10.CV();
			cmmmmmm11.CV();
			cmmmmmm12.CV();
			cmmmmmm13.CV();
			cmmmmmm14.CV();
			
			break;
			
		case 30:
			
			if(r == 0) {
				
				b[0] = true;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
					
			}else if(r == 1) {
					
				b[0] = false;
				b[1] = true;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 2) {
				
				b[0] = false;
				b[1] = false;
				b[2] = true;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 3) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = true;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 4) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = true;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 5) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = true;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 6) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = true;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 7) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = true;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 8) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = true;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 9) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = true;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 10) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = true;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 11) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = true;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 12) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = true;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 13) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = true;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 14) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = true;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 15) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = true;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 16) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = true;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 17) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = true;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 18) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = true;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 19) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = true;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 20) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = true;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 21) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = true;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 22) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = true;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 23) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = true;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 24) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = true;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 25) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = true;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 26) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = true;
				b[27] = false;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 27) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = true;
				b[28] = false;
				b[29] = false;
				
			}else if(r == 28) {
				
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = true;
				b[29] = false;
				
			}else {
					
				b[0] = false;
				b[1] = false;
				b[2] = false;
				b[3] = false;
				b[4] = false;
				b[5] = false;
				b[6] = false;
				b[7] = false;
				b[8] = false;
				b[9] = false;
				b[10] = false;
				b[11] = false;
				b[12] = false;
				b[13] = false;
				b[14] = false;
				b[15] = false;
				b[16] = false;
				b[17] = false;
				b[18] = false;
				b[19] = false;
				b[20] = false;
				b[21] = false;
				b[22] = false;
				b[23] = false;
				b[24] = false;
				b[25] = false;
				b[26] = false;
				b[27] = false;
				b[28] = false;
				b[29] = true;
					
			}
				
			carpetas cbbbbbbb = new carpetas(0,0,b[0]);
			carpetas cmmmmmmm1 = new carpetas(0,1,b[1]);
			carpetas cmmmmmmm2 = new carpetas(0,2,b[2]);
			carpetas cmmmmmmm3 = new carpetas(0,1,b[3]);
			carpetas cmmmmmmm4 = new carpetas(0,2,b[4]);
			carpetas cmmmmmmm5 = new carpetas(0,1,b[5]);
			carpetas cmmmmmmm6 = new carpetas(0,2,b[6]);
			carpetas cmmmmmmm7 = new carpetas(0,1,b[7]);
			carpetas cmmmmmmm8 = new carpetas(0,2,b[8]);
			carpetas cmmmmmmm9 = new carpetas(0,2,b[9]);
			carpetas cmmmmmmm10 = new carpetas(0,1,b[10]);
			carpetas cmmmmmmm11 = new carpetas(0,2,b[11]);
			carpetas cmmmmmmm12 = new carpetas(0,1,b[12]);
			carpetas cmmmmmmm13 = new carpetas(0,2,b[13]);
			carpetas cmmmmmmm14 = new carpetas(0,2,b[14]);
			carpetas cmmmmmmm15 = new carpetas(0,1,b[15]);
			carpetas cmmmmmmm16 = new carpetas(0,2,b[16]);
			carpetas cmmmmmmm17 = new carpetas(0,1,b[17]);
			carpetas cmmmmmmm18 = new carpetas(0,2,b[18]);
			carpetas cmmmmmmm19 = new carpetas(0,1,b[19]);
			carpetas cmmmmmmm20 = new carpetas(0,2,b[20]);
			carpetas cmmmmmmm21 = new carpetas(0,1,b[21]);
			carpetas cmmmmmmm22 = new carpetas(0,2,b[22]);
			carpetas cmmmmmmm23 = new carpetas(0,2,b[23]);
			carpetas cmmmmmmm24 = new carpetas(0,1,b[24]);
			carpetas cmmmmmmm25 = new carpetas(0,2,b[25]);
			carpetas cmmmmmmm26 = new carpetas(0,1,b[26]);
			carpetas cmmmmmmm27 = new carpetas(0,2,b[27]);
			carpetas cmmmmmmm28 = new carpetas(0,2,b[28]);
			carpetas cmmmmmmm29 = new carpetas(0,2,b[29]);
				
			cbbbbbbb.CV();
			cmmmmmmm1.CV();
			cmmmmmmm2.CV();
			cmmmmmmm3.CV();
			cmmmmmmm4.CV();
			cmmmmmmm5.CV();
			cmmmmmmm6.CV();
			cmmmmmmm7.CV();
			cmmmmmmm8.CV();
			cmmmmmmm9.CV();
			cmmmmmmm10.CV();
			cmmmmmmm11.CV();
			cmmmmmmm12.CV();
			cmmmmmmm13.CV();
			cmmmmmmm14.CV();
			cmmmmmmm15.CV();
			cmmmmmmm16.CV();
			cmmmmmmm17.CV();
			cmmmmmmm18.CV();
			cmmmmmmm19.CV();
			cmmmmmmm20.CV();
			cmmmmmmm21.CV();
			cmmmmmmm22.CV();
			cmmmmmmm23.CV();
			cmmmmmmm24.CV();
			cmmmmmmm25.CV();
			cmmmmmmm26.CV();
			cmmmmmmm27.CV();
			cmmmmmmm28.CV();
			cmmmmmmm29.CV();
			
			break;
			
			default:
				
				System.out.println("Error.");
				
				break;
			
		}
		
	}
	
	public static void main(JPanel f) {
		
		//cb=carpetas buenas cm=carpetas malas
		
		/*VC j = new VC();
		f.removeAll();
		f.setLayout(new BorderLayout(0, 0));
		f.add(j, BorderLayout.CENTER);*/
		
		VC.setd();
		
	}

	public final static boolean[] Isb() {
		
		return CE.b;
		
	}
	
}