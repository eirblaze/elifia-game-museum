module.exports = (env) => {
  const merge = require('webpack-merge')

  // is_dev
  const is_dev = (env.webpack.mode != 'production')

  let r_module = {}

  r_module = merge(r_module,{
    sourceMap: is_dev, // PostCSS側もソースマップを設定
    plugins: {
      'autoprefixer': {
        overrideBrowserslist: [
          'last 1 version',
          '> 1%',
          'ie 11'
        ],
        grid: "autoplace",
      },
      'postcss-normalize-charset': {},
    }
  })

  if ( !is_dev ) {
    r_module = merge(r_module,{
      plugins: {
        'cssnano': {autoprefixer: false},
      }
    })
  }

  return r_module
}
