﻿import * as Common from "../common";
import SiteData from './../data/site-data.json';

( ($) => {
  // コンフリクト回避

  // 読み込み終了後に実行を予約
  $(document).ready( () => {

    // DOM
    let $lampGroups = $('.hover-lamp');
    if ( !Common.jq_alive($lampGroups) ) return;

    for (var group in $lampGroups) {
      group.$lamp = $('.hover-lamp__lamp');
      group.$senser = $('.hover-lamp__switch');
    }

    // 画像オブジェクト設定
    const lampImgs = {
      hover: SiteData.baseUrl + '/img/bl2.gif',
      unhover: SiteData.baseUrl + '/img/bl1.gif'
    };

    function toHoverImg($jq){
      $jq.css({
        backgroundImage: lampImgs.hover,
      });
    }

    function toUnHoverImg($jq){
      $jq.css({
        backgroundImage: lampImgs.unhover,
      });
    }

    // ホバーイベント
    $senser.on('mouseover');


    // ホバー解除イベント
    $senser.on('mouseout');

  });
})(jQuery);
