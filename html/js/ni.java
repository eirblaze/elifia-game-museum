/* �X�R�A�o�^���W���[���A�g�b�v�y�[�W�y�уX�e�[�W���̈ړ����j���[ */

/* ��Փx���W�I�{�^���̌��o */
function nani() {
	var i;
	if (document.go.nani.length) {
		for (i = 0; i < document.go.nani.length; i++) {
			if (document.go.nani[i].checked) {
//				alert(document.go.nani[i].value);
				nan = document.go.nani[i].value;
			}
		}
	} else {
		if (document.go.nani.checked) {
//			alert(document.go.nani.value);
			nan = document.go.nani.value;
		}
	}
	return nan;
}

function gotohell(m,ms2) {
	if(m=='99')
		document.go.ms2.value='�X�e�[�W�Ɠ�Փx��I��ł���i���J�n�{�^���������ƁA�����֐i���ł��܂��B';
	else {
		nan = nani();
		location.href=(nan+m+'.html');
	}
}

function ran(m,ms2) {
	if(m=='99')
		document.go.ms2.value='�X�e�[�W�Ɠ�Փx��I��ł���Ranking�Q�ƃ{�^���������ƁA�����̃����L���O�����邱�Ƃ��ł��܂��B';
	else {
		nan = nani();
		document.ranker.channel.value = (nan+m);
		Lv = ranktitle(nan);
		document.ranker.title.value = ('M.S.O.���̌��J�� '+Lv+'���x�� �X�e�[�W'+m);
//		alert(document.ranker.channel.value);
//		alert(document.ranker.title.value);
		document.ranker.mode.value = "read";
		document.ranker.submit();
	}
}

function ranktitle(r) {
	switch(r) {
	case 'easy-' :Lv = ('�ȒP');break;
	case 'nomal' :Lv = ('����');break;
	case 'stage' :Lv = ('�n��');break;
	default : Lv = ('�H');break;
	}
	return Lv;
}

function gotohell2(m,r) {

if(m=="99")
	alert('�X�e�[�W��I��ł���{�^���������ƁA\n�����֐i���ł��܂��B');
else
	location.href=(r+m+'.html');
}

function gotohell3(r) {

	/* ���Ȓ��o */
	string = document.URL;
	p = string.slice(-7);
	q = p.match(/[0-9][0-9]/);

	location.href=(r+q+'.html');
}


//  �O���[�o���ϐ�
var highscore = 0;


//  ���_�𑗐M����
function soushin() {


	if(document.F1.author.value == "") {
		alert("���O����͂��ĉ������B");
	}
	else if(document.F1.author.value.length > 40) {
		alert("���O�����߂��܂��B");
	}
	else if(highscore < 10) {
		//  10 �_�������Ƒ��M�ł��Ȃ�
		document.F1.score.value = highscore;
		alert("���_���Ⴂ�̂ő��M�ł��܂���B");
	}
	else {
		//  ���M����
		document.F1.score.value = highscore;
		document.F1.mode.value = "write";
		document.F1.submit();
	}
}


//  �����L���O������
function miru() {

	document.F1.mode.value = "read";
	document.F1.submit();
}


//  �n�C�X�R�A���擾����
function registerHiScore(score) {


	//  �n�C�X�R�A���擾����
	highscore = score;

	//  �n�C�X�R�A��\������
	document.F1.score.value = highscore;
}


string = document.URL;
p = string.slice(-7);
q = p.match(/[0-9][0-9]/);
r = string.slice(-12,-7)

/* alert(q); �f�o�b�O��p*/

document.open();

if (q!=null) {
	document.write('<FORM ACTION="#" NAME="msidou2">\n');
	document.write('<SELECT name="menu">\n');
}
document.write('<OPTION value="99">�X�e�[�W�Z���N�g</OPTION>\n');
/*
document.write('<OPTION value="99"> </OPTION>');
document.write('<OPTION value="99">��ꕔ ���̐������߂�</OPTION>');
document.write('<OPTION value="99"> </OPTION>');
*/

if (q != "00")
document.write('<OPTION value="00">0. '+sname(0)+'</OPTION>');
if (q != "01")
document.write('<OPTION value="01">1. '+sname(1)+'</OPTION>');
if (q != "02")
document.write('<OPTION value="02">2. '+sname(2)+'</OPTION>');
if (q != "03")
document.write('<OPTION value="03">3. '+sname(3)+'</OPTION>');
if (q != "04")
document.write('<OPTION value="04">4. '+sname(4)+'</OPTION>');
if (q != "05")
document.write('<OPTION value="05">5. '+sname(5)+'</OPTION>');
if (q != "06")
document.write('<OPTION value="06">6. '+sname(6)+'</OPTION>');
if (q != "07")
document.write('<OPTION value="07">7. '+sname(7)+'</OPTION>');
if (q != "08")
document.write('<OPTION value="08">8. '+sname(8)+'</OPTION>');
if (q != "09")
document.write('<OPTION value="09">9-1.'+sname(9)+'</OPTION>');
if (q != "10")
document.write('<OPTION value="10">9-2.'+sname(10)+'</OPTION>');
if (q != "11")
document.write('<OPTION value="11">9-3.'+sname(11)+'</OPTION>');
if (q != "12")
document.write('<OPTION value="12">10-1.'+sname(12)+'</OPTION>');
if (q != "13")
document.write('<OPTION value="13">10-2.'+sname(13)+'</OPTION>');
if (q != "14")
document.write('<OPTION value="14">10-3.'+sname(14)+'</OPTION>');
if (q != "15")
document.write('<OPTION value="15">10-4.'+sname(15)+'</OPTION>');
if (q != "16")
document.write('<OPTION value="16">Last.'+sname(16)+'</OPTION>');
/*
document.write('<OPTION value="99"> </OPTION>');
document.write('<OPTION value="99">��� �Ñ㗳�̖�]</OPTION>');
document.write('<OPTION value="99"> </OPTION>');
if (q != "17")
document.write('<OPTION value="17">�O�D'+sname(17)+'</OPTION>');
if (q != "18")
document.write('<OPTION value="18">�P�D'+sname(18)+'</OPTION>');
if (q != "19")
document.write('<OPTION value="19">�Q�D'+sname(19)+'</OPTION>');
if (q != "20")
document.write('<OPTION value="20">�R�D'+sname(20)+'</OPTION>');
if (q != "21")
document.write('<OPTION value="21">�S�D'+sname(21)+'</OPTION>');
if (q != "22")
document.write('<OPTION value="22">�T�D'+sname(22)+'</OPTION>');
if (q != "23")
document.write('<OPTION value="23">�U�D'+sname(23)+'</OPTION>');
if (q != "24")
document.write('<OPTION value="24">�V�D'+sname(24)+'</OPTION>');
if (q != "25")
document.write('<OPTION value="25">�W�D'+sname(25)+'</OPTION>');
if (q != "26")
document.write('<OPTION value="26">�X�D'+sname(26)+'</OPTION>');
if (q != "27")
document.write('<OPTION value="27">10�D'+sname(27)+'</OPTION>');
*/
document.write('</SELECT>');
if (q!=null) {
	document.write('<INPUT TYPE="BUTTON" NAME="go" VALUE="easy" onClick="gotohell2(menu.options[menu.selectedIndex].value,\'easy-\')">');
	document.write('<INPUT TYPE="BUTTON" NAME="to" VALUE="nomal" onClick="gotohell2(menu.options[menu.selectedIndex].value,\'nomal\')">');
	document.write('<INPUT TYPE="BUTTON" NAME="hell" VALUE="hell" onClick="gotohell2(menu.options[menu.selectedIndex].value,\'stage\')"><BR>');
	document.write('�����̓�Ղ�x�ύX��');
	if (r != "easy-")
		document.write('<INPUT TYPE="BUTTON" NAME="e" VALUE="�ȒP��" onClick="gotohell3(\'easy-\')">');
	if (r != "nomal")
		document.write('<INPUT TYPE="BUTTON" NAME="n" VALUE="���ʉ�" onClick="gotohell3(\'nomal\')">');
	if (r != "stage")
		document.write('<INPUT TYPE="BUTTON" NAME="h" VALUE="�n����" onClick="gotohell3(\'stage\')">');
	document.write('</FORM>');

	document.write('<APPLET CODE="GRSSendModule.class" CODEBASE="." NAME="GRSSM" WIDTH="0" HEIGHT="0" ARCHIVE="mc_c.zip" MAYSCRIPT>\n');
	document.write('<PARAM NAME="SENDHIONLY" VALUE="false">\n');
	document.write('</APPLET>\n');

	document.write('<HR WIDTH="95%" ALIGN="CENTER" COLOR="#3300CC">\n');

	document.write('<form action="./sr.cgi" name="F1" method="POST">\n');
	document.write('���O <input type="text" name="author" size="45">\n');
	document.write('���_ <input type="text" name="score"  size="10" value="0"><br>\n');
	document.write('���[�� <input type="text" name="email" size="30"><br>\n');
	document.write('<input type="hidden" name="mode" value="write">\n');

//  �����L���O�ɕ\�������^�C�g��
	Lv = ranktitle(r);

//	alert(Lv+r+q);

	document.write('<input type="hidden" name="title" value="M.S.O.���̌��J�� '+Lv+'���x�� �X�e�[�W'+r+'">\n');

//  �����L���O�̃`�����l��
	document.write('<input type="hidden" name="channel" value="'+r+q+'">\n');

	document.write('<input type="button" value="���_�𑗐M����" onClick="soushin()">\n');
	document.write('<input type="button" value="�����L���O������" onClick="miru()">\n');
	document.write('</form>\n');

}

document.close();
