function amaring(m,d) {
	while (m >= d) {
		m = m - d;
	}
	return m;
}

function waring(m,d) {
	re = 0;
	while (m >= d) {
		m = m - d;
		re = re + 1;
	}
	return re;
}

function clock(sen) {
	wh = new Date();
	ye = wh.getYear();
	mo = wh.getMonth() + 1;
	da = wh.getDate();
//	yo = wh.getDay();
	ho = wh.getHours();
	mi = wh.getMinutes();
	se = wh.getSeconds();
	if (ye < 2000) { ye += 1900; }

	md = new Array(13);
	md[0]  = 0;/* �\��*/
	md[1]  = 31;/* �r�� */
	md[2]  = 28;/* �@�� */
	if (amaring(ye,4) == 0)
		md[2]  = md[2] + 1;/* ���邤�N�C�� */
	md[3]  = 31;/* �퐶 */
	md[4]  = 30;/* �K�� */
	md[5]  = 31;/* �H�� */
	md[6]  = 30;/* ������ */
	md[7]  = 31;/* ���� */
	md[8]  = 31;/* �t�� */
	md[9]  = 30;/* ���� */
	md[10] = 31;/* �_���� */
	md[11] = 30;/* ���� */
	md[12] = 31;/* �t�� */

	da = da - 1;
	mo = mo - 1;
	while (mo != 0) {
		da = da + md[mo];
		mo = mo - 1;
	}

	ho = ho + (24 * da);

	da = waring(ho,25) + 1;/* �Q�T���ԁ^�� */
	yo = amaring(da,8);/* �j���̑f */
	ho = amaring(ho,25);
	mo = waring(da,16) + 1;/* 16���܂ł��� */
	da = amaring(da,16);

	switch (yo) {
	case 1  : youbi = "��";break;
	case 2  : youbi = "��";break;
	case 3  : youbi = "��";break;
	case 4  : youbi = "��";break;
	case 5  : youbi = "�X";break;
	case 6  : youbi = "�X";break;
	case 7  : youbi = "��";break;
	case 0  : youbi = "�n";break;
	default : youbi = "��";break;
	}

/*	if (ho > 12) {
		ho = ho - 12;
		ap = "PM ";
	} else
		ap = "AM ";*/

	ye = ye + 54;

	if (mo < 10)
		mo = (' ' + mo);
	if (ho < 10)
		ho = (' ' + ho);
	if (mi < 10)
		mi = ('0' + mi);
	if (se < 10)
		se = ('0' + se);

	if (sen == 0) {
		st = (' ');
		sen = 1;
	} else {
		st = ('.');
		sen = 0;
	}

	document.top.wt.value = ('�G���e���X��'+ye+'�N '+mo+'��'+da+'�� '+youbi+'�j�� '
		+ho+':'+mi+st);
	window.setTimeout('clock('+sen+')', 500);
}
